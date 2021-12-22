public class Mouthology {
    public static void main(String[] args) {
        Person professor = Person.build()
                .setProfession("Professor")
                .setBiology(true)
                .setEcology(true)
                .setGeography(true)
                .setZoology(true)
                .setPhysiology(true)
                .getPerson();
        System.out.println(professor.isBiology());
    }

}

class Person {


    private boolean biology = false;
    private boolean ecology = false;
    private boolean zoology = false;
    private boolean geography = false;
    private boolean physiology = false;
    private boolean swiminology = false;
    private boolean escapology = false;
    private boolean sharkology = false;
    private boolean crocodilogy = false;
    private boolean assology = false;
    private boolean headology = false;
    private boolean mouthology = false;
    private String profession = "";


    public static Builder build() {
        return new Person().new Builder();
    }

    public class Builder {
        private void builder() {

        }

        public Person getPerson() {
            return Person.this;
        }

        public Builder setBiology(boolean biology) {
            Person.this.biology = biology;
            return this;
        }

        public Builder setEcology(boolean ecology) {
            Person.this.ecology = ecology;
            return this;
        }

        public Builder setZoology(boolean zoology) {
            Person.this.zoology = zoology;
            return this;
        }

        public Builder setGeography(boolean geography) {
            Person.this.geography = geography;
            return this;
        }

        public Builder setPhysiology(boolean physiology) {
            Person.this.physiology = physiology;
            return this;
        }

        public Builder setSwiminology(boolean swiminology) {
            Person.this.swiminology = swiminology;
            return this;
        }

        public Builder setEscapology(boolean escapology) {
            Person.this.escapology = escapology;
            return this;
        }

        public Builder setSharkology(boolean sharkology) {
            Person.this.sharkology = sharkology;
            return this;
        }

        public Builder setCrocodilogy(boolean crocodilogy) {
            Person.this.crocodilogy = crocodilogy;
            return this;
        }

        public Builder setAssology(boolean assology) {
            Person.this.assology = assology;
            return this;
        }

        public Builder setHeadology(boolean headology) {
            Person.this.headology = headology;
            return this;
        }

        public Builder setMouthology(boolean mouthology) {
            Person.this.mouthology = mouthology;
            return this;
        }

        public Builder setProfession(String profession) {
            Person.this.profession = profession;
            return this;
        }
    }


    public boolean isBiology() {
        return biology;
    }

    public boolean isEcology() {
        return ecology;
    }

    public boolean isZoology() {
        return zoology;
    }

    public boolean isGeography() {
        return geography;
    }

    public boolean isPhysiology() {
        return physiology;
    }

    public boolean isSwiminology() {
        return swiminology;
    }

    public boolean isEscapology() {
        return escapology;
    }

    public boolean isSharkology() {
        return sharkology;
    }

    public boolean isCrocodilogy() {
        return crocodilogy;
    }

    public boolean isAssology() {
        return assology;
    }

    public boolean isHeadology() {
        return headology;
    }

    public boolean isMouthology() {
        return mouthology;
    }

    public String getProfession() {
        return profession;
    }


}