package ListaDuplamenteEncadeada;

class ListaDupla {
    private NoDuplo inicio;
    private NoDuplo fim;
    private int tamanho;

    public ListaDupla() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void inserirNoInicio(int valor) {
        NoDuplo novo = new NoDuplo(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        NoDuplo novo = new NoDuplo(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
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
        if (pos == tamanho) {
            inserirNoFinal(valor);
            return;
        }

        NoDuplo novo = new NoDuplo(valor);
        NoDuplo temp = inicio;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.proximo;
        }
        novo.proximo = temp.proximo;
        novo.anterior = temp;
        temp.proximo.anterior = novo;
        temp.proximo = novo;
        tamanho++;
    }

    public void removerNoInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
    }

    public void removerNoFinal() {
        if (fim == null) {
            System.out.println("Lista vazia!");
            return;
        }
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
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
        if (pos == tamanho - 1) {
            removerNoFinal();
            return;
        }

        NoDuplo temp = inicio;
        for (int i = 0; i < pos; i++) {
            temp = temp.proximo;
        }
        temp.anterior.proximo = temp.proximo;
        temp.proximo.anterior = temp.anterior;
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        NoDuplo temp = inicio;
        System.out.print("Lista Dupla: ");
        while (temp != null) {
            System.out.print(temp.valor + " <-> ");
            temp = temp.proximo;
        }
        System.out.println("null");
    }
}

