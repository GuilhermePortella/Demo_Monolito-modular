# ADR-0002: Estilo arquitetural por modulo - Ports and Adapters

Status: Proposed
Date: 2026-01-05
Owners: Arquitetura
Deciders: Squad de Despesas
Tags: architecture, hexagonal, ports-adapters

## Context
- Desejo de isolar dominio e evitar acoplamento direto a frameworks.
- Necessidade de testes de regras sem infra.

## Decision
- Cada modulo tera as camadas:
  - pplication.port.in e pplication.port.out
  - domain
  - infrastructure
- Casos de uso vivem em pplication e dependem apenas de ports e domain.
- Adaptadores de entrada e saida vivem em infrastructure.

## Consequences
- Dominio fica isolado e testavel sem dependencia de infra.
- Substituicao de adaptadores fica simples e local.
- Aumenta o numero de pacotes e classes (boilerplate controlado).
