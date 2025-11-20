# 🦉 Minerva Chess Engine

> *"Na antiga Roma, festas em honra de Minerva, deusa da sabedoria, das artes e das ciências..."*

**Minerva** é um projeto de desenvolvimento de uma *Chess Engine* (Motor de Xadrez) construída do zero absoluto. O objetivo primário não é apenas criar um software que jogue xadrez, mas documentar a jornada de aprendizado, partindo da compreensão abstrata dos algoritmos até a otimização de baixo nível para alta performance.

![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-yellow)
![Languages](https://img.shields.io/badge/Languages-Python_%7C_Cython-blue)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 🎯 Filosofia do Projeto

A construção da Minerva segue uma abordagem de **Evolução Progressiva**:

1.  **Fase de Prototipagem (Python Puro):** O foco inicial é a legibilidade e o domínio dos conceitos abstratos (Geradores de movimentos, Minimax, Avaliação). Python permite testar lógicas complexas rapidamente, focando na arquitetura e na correção das regras do xadrez.
2.  **Fase de Performance (Cython):** Uma vez que a lógica esteja validada, os gargalos de processamento serão otimizados utilizando **Cython**. Isso permitirá compilar o código Python para C, unindo a facilidade de desenvolvimento do Python com a velocidade de execução de linguagens de baixo nível.

---

## 🗺️ Roteiro de Desenvolvimento (Roadmap)

### Fase 1: A Fundação (Python) 🐍
O foco atual é a implementação das regras e estrutura básica.

- [ ] **Representação do Tabuleiro:** Implementação inicial (Matriz 8x8 ou 0x88).
- [ ] **Gerador de Movimentos:** Lógica de movimentação para Peões, Cavalos, Bispos, Torres, Dama e Rei.
- [ ] **Movimentos Especiais:** Implementação de Roque, *En Passant* e Promoção.
- [ ] **Interface:** Comunicação básica via console (CLI).

### Fase 2: A Inteligência Clássica 🧠
Implementação de algoritmos de busca determinísticos.

- [ ] **Avaliação Estática:** Definição de pesos materiais e posicionais.
- [ ] **Minimax:** Implementação do algoritmo de busca recursiva.
- [ ] **Poda Alfa-Beta:** Otimização da árvore de busca para redução de nós visitados.
- [ ] **Protocolo UCI:** Integração para comunicação com GUIs (Arena, Lichess, etc.).

### Fase 3: Aceleração com Cython ⚡
Refatoração visando velocidade extrema e tipagem estática.

- [ ] **Tipagem Estática:** Conversão de variáveis críticas e loops para tipos C (`cdef`).
- [ ] **Compilação de Módulos:** Transformação dos geradores de movimento e algoritmos de busca em extensões compiladas (.pyx).
- [ ] **Bitboards:** Otimização da representação do tabuleiro usando operações bit a bit, aproveitando a velocidade do C.
- [ ] **Gerenciamento de Tempo:** Controle de relógio preciso para partidas competitivas.

### Fase 4: O Estado da Arte 🤖
Implementação de técnicas modernas de IA.

- [ ] **MCTS:** Substituição/Hibridização com *Monte Carlo Tree Search*.
- [ ] **Redes Neurais (NNUE):** Avaliação de posições baseada em aprendizado de máquina.

---

## 📚 Referencial Teórico

O desenvolvimento da Minerva é fortemente embasado em literatura acadêmica especializada. As principais referências para a arquitetura atual incluem:

* **Representação de Tabuleiro e Lógica Básica:**
    * [cite_start]*Kuniyoshi, Y. M.* - Implementação elementar em C (Matrizes). [cite: 3512]
    * [cite_start]*Santana, H. V. M. D.* - Anatomia de um Motor e Técnica 0x88. [cite: 3]
* **Regras e Movimentação:**
    * [cite_start]*Mendes, J. M. P. & Andrade, M. H.* - Regras de Roque e En Passant. [cite: 4859]
* **Algoritmos de Busca (Minimax/Alfa-Beta):**
    * [cite_start]*Albuquerque, E. P.* - Aplicação do Algoritmo Minimax. [cite: 1101]
    * [cite_start]*Santos, V. B.* - Comparativo de desempenho e Poda Alfa-Beta. [cite: 4288]
* **Inteligência Artificial Moderna (Futuro):**
    * [cite_start]*Mariano, L.* - AlphaZero e Redes Convolucionais. [cite: 1541]
    * [cite_start]*Guimarães, M. M.* - MCTS e Aprendizado por Reforço. [cite: 5065]
    * [cite_start]*Pires, H. A. S.* - Visão Computacional e Machine Learning. [cite: 2146]
    * [cite_start]*Silva, D. H. E.* - Previsão de erros com Grafos. [cite: 2940]

---

## 🚀 Como Rodar (Em Breve)

*Atualmente o projeto está em fase de estruturação inicial. Instruções de instalação serão adicionadas assim que o primeiro protótipo jogável estiver disponível.*

### Pré-requisitos (Previstos)
* Python 3.8+
* Compilador C (GCC/MSVC) - *Necessário futuramente para compilar módulos Cython.*

---

## 🤝 Contribuições

Contribuições são muito bem-vindas! Se você tem interesse em IA, Xadrez ou otimização de código:

1.  Faça um **Fork** do projeto.
2.  Crie uma **Branch** para sua feature (`git checkout -b feature/NovaFeature`).
3.  Faça o **Commit** (`git commit -m 'Adicionando NovaFeature'`).
4.  Faça o **Push** (`git push origin feature/NovaFeature`).
5.  Abra um **Pull Request**.

---

**Autor:** [Lucas Fernandes/luc4sfernandes]
*Construindo sabedoria, um movimento de cada vez.*
