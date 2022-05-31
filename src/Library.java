public class Library{
    private Legal legal;
    private Artistic artistic;
    private Technical technical;
    private static int counterAllbook = 0;

    public Legal getLegal() {
        return legal;
    }

    public void setLegal(Legal legal) {
        this.legal = legal;
    }

    public Artistic getArtistic() {
        return artistic;
    }

    public void setArtistic(Artistic artistic) {
        this.artistic = artistic;
    }

    public Technical getTechnical() {
        return technical;
    }

    public void setTechnical(Technical technical) {
        this.technical = technical;
    }
}
