# ADR-0003: Regras de negocio como Policy + Rules

Status: Proposed
Date: 2026-01-05
Owners: Arquitetura
Deciders: Squad de Despesas
Tags: domain, rules, policy

## Context
- Regras de negocio complexas precisam ser explicitas e auditaveis.
- Mudancas frequentes exigem facil composicao e testes unitarios.

## Decision
- Cada modulo tera domain.rules com regras composaveis.
- Uma Policy agregadora orquestra a execucao das regras.
- As regras retornam resultado estruturado (violacoes, mensagens, codigos).

## Consequences
- Regras ficam claras, isoladas e testaveis.
- Facil identificar impacto de mudancas e justificar decisoes.
- Exige disciplina para padronizar o formato de regras e resultados.
