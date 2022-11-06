package EnumFile.EnumDemo;

public enum Season {
    SPRING("春"){
        @Override
        public void show() {
            System.out.println(this.name());
        }
    },
    SUMER("夏"){
        @Override
        public void show() {
            System.out.println(this.name());
        }
    },
    AUTUM("秋"){
        @Override
        public void show() {
            System.out.println(this.name());
        }
    },
    WITER("冬"){
        @Override
        public void show() {
            System.out.println(this.name());
        }
    };
    public String name;

    Season(String name) {
        this.name = name;
    }

    public abstract void show();
}
