# 📚 Revisão de Java (POO, Listas e Mapas)

Este repositório contém um resumo prático e direto dos principais conceitos de **Programação Orientada a Objetos (POO)** e **Estruturas de Dados** em Java. Criado como material de consulta rápida e estudos para provas.

---

## 📌 Índice
1. [Polimorfismo de Sobrecarga](#1-polimorfismo-de-sobrecarga)
2. [Herança e Polimorfismo de Sobreposição](#2-herança-e-polimorfismo-de-sobreposição)
3. [Listas Dinâmicas (ArrayList)](#3-listas-dinâmicas-arraylist)
4. [Mapas (HashMap)](#4-mapas-hashmap)

---

## 1. Polimorfismo de Sobrecarga
**Conceito:** Acontece quando temos **vários métodos com o mesmo nome** na mesma classe, mas eles recebem **parâmetros diferentes** (quantidade ou tipo). O Java descobre qual usar na hora em que você chama o método.

```java
public class CalculadoraDeArea {
    
    // 1 parâmetro (lado)
    public double calcularArea(double lado) {
        return lado * lado;
    }

    // 2 parâmetros (base e altura)
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    // 1 parâmetro (raio), mas a lógica é diferente do quadrado
    public double calcularArea(double raio) {
        return Math.PI * (raio * raio);
    }
}

## 2. Herança e Polimorfismo de Sobreposição
Conceito: Uma classe "Filha" herda as características da classe "Pai" usando a palavra extends. O Polimorfismo de Sobreposição acontece quando o filho reescreve a regra do pai usando a anotação @Override.

💡 Dica de Prova: Herança serve para reaproveitar código. Sobreposição serve para adaptar o comportamento!

// CLASSE PAI
class Funcionario {
    String nome;
    double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase; // Salário padrão
    }
}

// CLASSE FILHA (Gerente)
class Gerente extends Funcionario {
    
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase); // Manda os dados para o construtor do Pai
    }

    @Override // Reescrevendo a regra!
    public double calcularSalario() {
        return salarioBase * 1.20; // Gerente ganha 20% de bônus
    }
}

## 3. Listas Dinâmicas (ArrayList)
Conceito: Diferente do Array tradicional ([]) que tem tamanho fixo, o ArrayList tem tamanho dinâmico. Ele cresce e diminui automaticamente conforme adicionamos ou removemos itens.

import java.util.ArrayList;
import java.util.Collections;

public class ExemploLista {
    public static void main(String[] args) {
        // Criando a lista
        ArrayList<String> carros = new ArrayList<>();

        // Adicionando itens
        carros.add("Volvo");
        carros.add("BMW");

        // Tamanho da lista
        System.out.println("Tamanho: " + carros.size());

        // Verificando se existe um item
        System.out.println("Tem BMW? " + carros.contains("BMW"));

        // Ordenando em ordem alfabética
        Collections.sort(carros);
    }
}

## 4. Mapas (HashMap)
Conceito: Armazena dados no formato Chave / Valor. É como um dicionário do mundo real: você busca por uma palavra (chave) e ele te devolve o significado (valor).

import java.util.HashMap;

public class ExemploMapa {
    public static void main(String[] args) {
        // Criando o Mapa (Chave String, Valor String)
        HashMap<String, String> capitais = new HashMap<>();

        // Adicionando itens (Usamos .put em vez de .add)
        capitais.put("Brasil", "Brasília");
        capitais.put("Inglaterra", "Londres");

        // Pegando um valor específico usando a chave
        System.out.println("Capital do Brasil: " + capitais.get("Brasil"));

        // Removendo um item
        capitais.remove("Inglaterra");

        // Imprimindo todas as chaves
        for (String pais : capitais.keySet()) {
            System.out.println(pais);
        }
    }
}
