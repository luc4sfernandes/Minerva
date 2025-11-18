# Minerva

**Minerva** — named after the Roman goddess of wisdom and strategic warfare — is my experimental chess engine written in **Python**.

> Short goal: prototype algorithms in Python, integrate NNUE, and eventually port the entire core to C/C++ to achieve real speed and scalability.

---

## About the author
**Lucas Fernandes** — ADS student from Rio de Janeiro, Brazil.  
This is my personal project for learning, experimentation, and building a chess engine from scratch.

---

## What Minerva is (in a few words)
Minerva is a software–engineering playground focused on chess engines.  
I start in Python to validate ideas and guarantee correctness; then explore NNUE; and finally port the core to C/C++ for real performance.

---

## Roadmap (essential and direct)
1. **Prototype (Python)** — clean design, full correctness, perft tests.  
2. **NNUE** — integrate neural evaluation when appropriate, prioritizing fast inference.  
3. **C/C++ port** — migrate hotspots (move generation, make/undo, search) and optimize for millions of nodes/s.  
4. **Tuning & releases** — refine heuristics and publish stable versions.

---

## Design choices (confirmed)
- **Board representation:** *mailbox* — simple, clear, great for learning.  
- **First focus:** full correctness (perft) and a transparent search model (negamax / alpha-beta / qsearch).  
- **Progression:** Python = prototyping & experiments; C/C++ = production & performance.

---

## How to contribute
If you want to collaborate:
- open an issue describing your idea;
- prefer small, testable changes;
- any large PR should include a correctness test (e.g., a perft case).

---

## Contact
Lucas Fernandes — ADS student, Rio de Janeiro, Brazil.

---

Thanks for checking out Minerva.  
This repository is a space for experimentation — if you enjoy chess engines or want to help with testing/perft, feel free to join!
