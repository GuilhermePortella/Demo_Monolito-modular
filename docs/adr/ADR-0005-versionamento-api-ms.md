# ADR-0005: (Para MS) Versionamento de API via /v{n} + compat policy

Status: Proposed
Date: 2026-01-05
Owners: Arquitetura
Deciders: Squad de Despesas
Tags: api, versioning, compatibility

## Context
- Caso haja extracao de modulo ou exposicao de API externa, consumidores precisam de previsibilidade.
- Breaking changes sem controle geram risco operacional e de negocio.

## Decision
- Versionar APIs via URI: /v{n}.
- Proibir breaking changes em releases minor.
- Definir politica de deprecation com janela clara (ex.: 6-12 meses).

## Consequences
- Consumidores ganham previsibilidade e tempo de migracao.
- Mantem custo de suporte a versoes antigas por um periodo.
- Requer governanca de contratos e comunicacao com consumidores.
