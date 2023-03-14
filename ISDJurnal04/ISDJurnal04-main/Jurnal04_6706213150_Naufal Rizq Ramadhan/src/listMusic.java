public class listMusic {
    private String lagu;
    private String penyanyi;
    {
}
public listMusic (String lagu, String penyanyi) {
    this.lagu = lagu;
    this.penyanyi = penyanyi;
}

public String judul(){
    return lagu;
}


@Override
public String toString(){return lagu + " - " + penyanyi;}
}
