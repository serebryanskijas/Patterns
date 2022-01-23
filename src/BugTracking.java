public class BugTracking { // Цепочка ответственности
    public static void main(String[] args) {
        SimpleReportSender simpleReportSender = new SimpleReportSender(Priority.ROUTINE);
        EMailSender eMailSender = new EMailSender(Priority.IMPORTANT);
        SmsSender smsSender = new SmsSender(Priority.ASAP);
        simpleReportSender.setNext(eMailSender);
        eMailSender.setNext(smsSender);
        simpleReportSender.notify("Error", Priority.ASAP);
    }

}

enum Priority {ROUTINE, IMPORTANT, ASAP}

abstract class Notifier {
    private Priority priority;
    private Notifier next;

    public Notifier(Priority priority) {
        this.priority = priority;
    }

    public void setNext(Notifier next) {
        this.next = next;
    }

    public void notify(String message, Priority priority) {
        if (priority.ordinal() >= this.priority.ordinal()) {
            sendMessage(message);
            if (next != null) {
                next.notify(message, priority);
            }
        }
    }

    public abstract void sendMessage(String message);
}

class SimpleReportSender extends Notifier {

    public SimpleReportSender(Priority priority) {
        super(priority);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " Simple report, level - " + Priority.ROUTINE.toString());
    }
}

class EMailSender extends Notifier {

    public EMailSender(Priority priority) {
        super(priority);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " Email, level - " + Priority.IMPORTANT.toString());
    }
}

class SmsSender extends Notifier {

    public SmsSender(Priority priority) {
        super(priority);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message + " Sms, level - " + Priority.ASAP.toString());
    }
}