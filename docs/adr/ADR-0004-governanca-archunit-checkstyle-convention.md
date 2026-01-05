# ADR-0004: Governanca - ArchUnit + Checkstyle + Convention Plugins

Status: Proposed
Date: 2026-01-05
Owners: Arquitetura
Deciders: Squad de Despesas
Tags: governance, quality, build

## Context
- Monolito modular precisa de enforcement automatico para evitar dependencia indevida.
- Padroes de estilo e build devem ser consistentes em todos os modulos.

## Decision
- Adotar ArchUnit para validar dependencias entre modulos e camadas.
- Adotar Checkstyle para padrao de codigo.
- Criar Convention Plugins Gradle para unificar configuracoes.

## Consequences
- Menos erosao arquitetural e feedback rapido no build.
- Padroes consistentes em todos os modulos.
- Custo inicial de setup e manutencao dos plugins.
