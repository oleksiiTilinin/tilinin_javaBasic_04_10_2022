public class PolymorphismClass {

    public static class MusicStyles {

        public String groupName;

        MusicStyles(String groupName) {
            this.groupName = groupName;

        }

        void playMusic() {
            System.out.println("buga-wuga");
        }
    }

    public static class PopMusic extends MusicStyles {
        PopMusic(String groupName) {
            super(groupName);
            this.groupName = groupName;
        }

        @Override
        public void playMusic() {
            System.out.println(this.groupName);
            System.out.println("yo-yo");
        }
    }

    public static class RockMusic extends MusicStyles {
        RockMusic(String groupName) {
            super(groupName);
            this.groupName = groupName;
        }

        @Override
        public void playMusic() {
            System.out.println(this.groupName);
            System.out.println("rock-rock");
        }
    }

    public static class ClassicMusic extends MusicStyles {
        ClassicMusic(String groupName) {
            super(groupName);
            this.groupName = groupName;
        }

        @Override
        public void playMusic() {
            System.out.println(this.groupName);
            System.out.println("pim-pim");
        }
    }

    public static void main(String[] args) {
        PopMusic justinBieber = new PopMusic("Justin Bieber");
        RockMusic AcDc = new RockMusic("AC / DC");
        ClassicMusic Bach = new ClassicMusic("Johann Sebastian Bach");

        justinBieber.playMusic();
        AcDc.playMusic();
        Bach.playMusic();


    }

}
