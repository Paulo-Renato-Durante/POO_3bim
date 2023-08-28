public class ControleCaracteres {

    private String string;

    public ControleCaracteres(String s) {
        this.setString(s);
    }

    public void setString(String s) {
        this.string = s.trim();
    }
    public String getString() {
        return string;
    }

    public String getUpperFirstLetter() {
        String firstLetter = getString().substring(0, 1).toUpperCase();

        return firstLetter +getString().substring(1);
    }

}
