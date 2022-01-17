
package Model;

public class Calculadoraci {

    private Double Valor1;
    private Double Valor2;
    private Character Sinal;

    public Calculadoraci() {
    }
        public Double Operacao() {
            Double resultado;
            switch (this.getSinal()) {
                case ('+'):
                    resultado = this.getValor1() + this.getValor2();
                    break;
                case ('-'):
                    resultado = this.getValor1() - this.getValor2();
                    break;
                case ('/'):
                    resultado = this.getValor1() / this.getValor2();
                    break;
                case ('*'):
                    resultado = this.getValor1() * this.getValor2();
                    break;
                default: resultado = 0.0;
            }

            return resultado;
        }

    public Character getSinal() {return Sinal;}
    public void setSinal(Character Sinal) {this.Sinal = Sinal;}

    public Double getValor1() {return Valor1;}
    public void setValor1(Double Valor1) {this.Valor1 = Valor1;}

    public Double getValor2() {return Valor2;}
    public void setValor2(Double Valor2) {this.Valor2 = Valor2;}
}
