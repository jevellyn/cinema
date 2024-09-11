public class Assento {
    private boolean[][] disponivel;

    public Assento() {
        disponivel = new boolean[5][4];
        for (int i = 0; i < disponivel.length; i++) {
            for (int j = 0; j < disponivel[i].length; j++) {
                disponivel[i][j] = true;
            }
        }
    }

    public String mostraLugares() {
        StringBuilder lugares = new StringBuilder();

        for (int i = 0; i < disponivel.length; i++) {
            for (int j = 0; j < disponivel[i].length; j++) {
                if (disponivel[i][j]) {
                    lugares.append("|   ");
                } else {
                    lugares.append("| X ");
                }
            }
            lugares.append("|\n");
            //System.out.println();
            
        }

        return lugares.toString();
    }

    public boolean venderAssento(int fila, int assento) {
         if (disponivel[fila][assento]) {
             disponivel[fila][assento] = false;
             return true;
         }
         return false;
     }
}
