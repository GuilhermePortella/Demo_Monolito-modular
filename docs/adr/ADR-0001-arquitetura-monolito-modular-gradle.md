# ADR-0001: Arquitetura - Monolito Modular com multi-modulos Gradle

Status: Proposed
Date: 2026-01-05
Owners: Arquitetura
Deciders: Squad de Despesas
Tags: architecture, modular-monolith, gradle

## Context
- Dominio acoplado com invariantes criticas (orcamento, compliance, auditoria).
- Time unico, baixo/medio volume, necessidade de consistencia e baixa complexidade operacional.
- Necessidade de boundaries explicitos sem custo de distribuicao.

## Decision
- Adotar monolito modular com multi-modulos Gradle.
- Cada modulo e um projeto java-library com separacao *-api e *-impl.
- O artefato executavel fica em :app (projeto pplication).
- Dependencias entre modulos somente via *-api.

## Consequences
- Boundaries ficam explicitos, refatoracao e evolucao ficam mais baratas.
- Um deploy simplifica observabilidade e incidentes.
- Extracao futura de modulos fica viavel com menor custo.
- Exige governanca automatizada para evitar erosao arquitetural.

## Notes
- Caso o build tool mude, este ADR deve ser revisado.
