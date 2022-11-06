package EnumFile.EumeCompare;

public enum Season {

    SPRING("春"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },

    SUMMER("夏"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },

    AUTUME("秋"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    },

    WINTER("冬"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    };
    public abstract void show();

    public String name;

    Season() {}

    private Season(String name) {
        this.name = name;
    }

}
