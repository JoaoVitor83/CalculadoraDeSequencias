package CalculadoraDeSequencias;

public class Model {

    private float primeiroNum, ultimoNum, soma;

    public Model(float primeiroNum, float ultimoNum, float soma) {
        this.primeiroNum = primeiroNum;
        this.ultimoNum = ultimoNum;
        this.soma = soma;
    }

    public float getPrimeiroNum() {
        return primeiroNum;
    }

    public void setPrimeiroNum(float primeiroNum) {
        this.primeiroNum = primeiroNum;
    }

    public float getUltimoNum() {
        return ultimoNum;
    }

    public void setUltimoNum(float ultimoNum) {
        this.ultimoNum = ultimoNum;
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }

    @Override
    public String toString() {
        return "Model{" + "primeiroNum=" + primeiroNum + ", ultimoNum=" + ultimoNum + ", soma=" + soma + '}';
    }
}
