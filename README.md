# Minerva

**Minerva** — nome inspirado na deusa romana da sabedoria e da guerra estratégica — é a minha engine de xadrez experimental escrita em **Python**.

> Objetivo curto: desenvolver o melhor algoritmo que eu conseguir, prototipando em Python, integrando NNUE e depois migrando todo o núcleo para C/C++ para ganhar velocidade e escala.

---

## Quem faz
**Lucas Fernandes** — estudante de ADS.  
Este é meu projeto pessoal para aprender, experimentar e construir uma engine do zero.

---

## O que é Minerva (em poucas palavras)
Minerva é um laboratório de engenharia de software aplicado a motores de xadrez. Começo em Python para validar ideias e garantir correção; depois trago inferência NNUE e, por fim, porto o core para C/C++ visando performance real.

---

## Plano (essencial e direto)
1. **Protótipo (Python)** — design simples, correção e testes.  
2. **NNUE** — integrar avaliação por rede (quando fizer sentido), preferindo inferência nativa para não estrangular a busca.  
3. **Port para C/C++** — migrar hotspots (movegen, make/undo, search) e otimizar para milhões de nós/s.  
4. **Tuning & releases** — afinar heurísticas e publicar versões.

---

## Escolhas de design (confirmadas)
- **Representação inicial:** *mailbox* — por ser simples e didática.  
- **Foco inicial:** correção total (perft) e uma busca clara (negamax / alpha-beta / qsearch).  
- **Progresso:** Python = protótipo & experimentos; C/C++ = produção & performance.

---

## Como contribuir (simples)
Se quiser colaborar:
- abra uma *issue* descrevendo a ideia;
- prefira mudanças pequenas e testáveis;
- todo PR grande deve vir com um teste (ex.: perft case) que comprove correção.

---

## Contato
Lucas Fernandes — estudante ADS.  

---

Obrigado por visitar o Minerva. O repositório é um espaço de experimentação — se curte motores ou quer ajudar com testes/perft, junte-se.
