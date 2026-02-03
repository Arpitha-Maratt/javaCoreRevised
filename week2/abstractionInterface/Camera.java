package week2.abstractionInterface;

public interface Camera {
    void takePhoto();
}

interface MusicPlayer{
    void playMusic();
}

class SmartPhone implements Camera,MusicPlayer{
    public void takePhoto(){
        System.out.println("Taking photo");
    }

    public void playMusic(){
        System.out.println("Playing music");
    }
}


