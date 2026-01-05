# Visao geral da arquitetura

## Premissas
- Produto interno com baixo/medio volume
- Dominio acoplado e invariantes criticas
- Um time e um deploy

## Estilo
Monolito modular (DDD light/medium). Cada modulo possui:
- Dominio e aplicacao isolados
- API interna (ports)
- Acesso a dados encapsulado

## Dados
- Banco unico com esquemas/tabelas por modulo
- Transacoes locais para fluxos criticos
- Outbox para eventos externos quando necessario

## Observabilidade
- Logs estruturados com correlationId
- Tracing dentro do runtime
- Auditoria imutavel por evento de dominio
