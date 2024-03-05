public class OperasiTitik {
    private void refleksiSumbuX(Titik titik) {
        titik.setOrdinat(-titik.getOrdinat());
    }
    private void refleksiSumbuY(Titik titik) {
        titik.setAbsis(titik.getAbsis());
    }

    public Titik refleksiX(Titik titik) {
        titik.setOrdinat(-titik.getOrdinat());
        return titik;
    }
    public Titik refleksiY(Titik titik) {
        titik.setAbsis(-titik.getAbsis());
        return titik;
    }
}