# 🦉 Minerva Chess Engine

> *"Na antiga Roma, festas em honra de Minerva, deusa da sabedoria, das artes e das ciências..."*

**Minerva** é um projeto de desenvolvimento de uma *Chess Engine* (Motor de Xadrez) construída do zero absoluto. O objetivo primário não é apenas criar um software que jogue xadrez, mas documentar a jornada de aprendizado, partindo da compreensão abstrata dos algoritmos até a otimização de baixo nível para alta performance.

![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-yellow)
![Languages](https://img.shields.io/badge/Languages-Python_%7C_C%2B%2B-blue)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 🎯 Filosofia do Projeto

A construção da Minerva segue uma abordagem de **Dupla Iteração**:

1.  **Fase de Prototipagem (Python):** O foco é a legibilidade e o domínio dos conceitos abstratos (Geradores de movimentos, Minimax, Avaliação). Python permite testar lógicas complexas rapidamente sem se preocupar com gerenciamento de memória prematuro.
2.  **Fase de Performance (C/C++):** Uma vez que a lógica esteja validada, o motor será reescrito em C++ para explorar o máximo de eficiência de hardware, utilizando técnicas avançadas como *Bitboards* e gerenciamento manual de memória.

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
- [ ] **Poda Alfa-Beta:** Otimização da árvore de busca.
- [ ] **Protocolo UCI:** Integração para comunicação com GUIs (Arena, Lichess, etc.).

### Fase 3: A Transição para Performance (C++) ⚡
Refatoração total visando velocidade.

- [ ] **Portabilidade:** Migração da lógica validada para C++.
- [ ] **Bitboards:** Otimização da representação do tabuleiro usando operações bit a bit.
- [ ] **Gerenciamento de Tempo:** Controle de relógio para partidas competitivas.

### Fase 4: O Estado da Arte 🤖
Implementação de técnicas modernas de IA.

- [ ] **MCTS:** Substituição/Hibridização com *Monte Carlo Tree Search*.
- [ ] **Redes Neurais (NNUE):** Avaliação de posições baseada em aprendizado de máquina.

---

## 📚 Referencial Teórico

O desenvolvimento da Minerva é fortemente embasado em literatura acadêmica especializada. As principais referências para a arquitetura atual incluem:

* **Representação de Tabuleiro e Lógica Básica:**
    * [cite_start]*Kuniyoshi, Y. M.* - Implementação elementar em C (Matrizes). [cite: 4309]
    * [cite_start]*Santana, H. V. M. D.* - Anatomia de um Motor e Técnica 0x88. [cite: 2693]
* **Regras e Movimentação:**
    * [cite_start]*Mendes, J. M. P. & Andrade, M. H.* - Regras de Roque e En Passant. [cite: 3708]
* **Algoritmos de Busca (Minimax/Alfa-Beta):**
    * [cite_start]*Albuquerque, E. P.* - Aplicação do Algoritmo Minimax. [cite: 3867]
    * [cite_start]*Santos, V. B.* - Comparativo de desempenho e Poda Alfa-Beta. [cite: 5079]
* **Inteligência Artificial Moderna (Futuro):**
    * [cite_start]*Mariano, L.* - AlphaZero e Redes Convolucionais. [cite: 1375]
    * [cite_start]*Guimarães, M. M.* - MCTS e Aprendizado por Reforço. [cite: 3068]
    * [cite_start]*Pires, H. A. S.* - Visão Computacional e Machine Learning. [cite: 1979]
    * [cite_start]*Silva, D. H. E.* - Previsão de erros com Grafos. [cite: 802]

---

## 🚀 Como Rodar (Em Breve)

*Atualmente o projeto está em fase de estruturação inicial. Instruções de instalação serão adicionadas assim que o primeiro protótipo jogável estiver disponível.*

### Pré-requisitos (Previstos)
* Python 3.8+
* GCC / Clang (Futuro)

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
