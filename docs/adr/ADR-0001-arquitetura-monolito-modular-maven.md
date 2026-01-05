# ADR-0001: Arquitetura - Monolito Modular com multi-modulos Maven

Status: Proposed
Date: 2026-01-05
Owners: Arquitetura
Deciders: Squad de Despesas
Tags: architecture, modular-monolith, maven

## Context
- Dominio acoplado com invariantes criticas (orcamento, compliance, auditoria).
- Time unico, baixo/medio volume, necessidade de consistencia e baixa complexidade operacional.
- Necessidade de boundaries explicitos sem custo de distribuicao.

## Decision
- Adotar monolito modular com multi-modulos Maven.
- Cada modulo e um artefato jar com separacao *-api e *-impl.
- O artefato executavel fica no modulo app.
- Dependencias entre modulos somente via *-api.

## Consequences
- Boundaries ficam explicitos, refatoracao e evolucao ficam mais baratas.
- Um deploy simplifica observabilidade e incidentes.
- Extracao futura de modulos fica viavel com menor custo.
- Exige governanca automatizada para evitar erosao arquitetural.

## Notes
- Caso o build tool mude, este ADR deve ser revisado.
