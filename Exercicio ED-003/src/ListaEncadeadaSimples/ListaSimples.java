package ListaEncadeadaSimples;

class ListaSimples {
    private No inicio;
    private int tamanho;

    public ListaSimples() {
        inicio = null;
        tamanho = 0;
    }

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No temp = inicio;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novo;
        }
        tamanho++;
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos < 0 || pos > tamanho) {
            System.out.println("Posição inválida!");
            return;
        }
        if (pos == 0) {
            inserirNoInicio(valor);
            return;
        }
        No novo = new No(valor);
        No temp = inicio;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.proximo;
        }
        novo.proximo = temp.proximo;
        temp.proximo = novo;
        tamanho++;
    }

    public void removerNoInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        inicio = inicio.proximo;
        tamanho--;
    }

    public void removerNoFinal() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        if (inicio.proximo == null) {
            inicio = null;
        } else {
            No temp = inicio;
            while (temp.proximo.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = null;
        }
        tamanho--;
    }

    public void removerNaPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) {
            System.out.println("Posição inválida!");
            return;
        }
        if (pos == 0) {
            removerNoInicio();
            return;
        }
        No temp = inicio;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.proximo;
        }
        temp.proximo = temp.proximo.proximo;
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        No temp = inicio;
        System.out.print("Lista: ");
        while (temp != null) {
            System.out.print(temp.valor + " -> ");
            temp = temp.proximo;
        }
        System.out.println("null");
    }
}