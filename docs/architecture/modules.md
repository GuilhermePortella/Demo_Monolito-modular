# Modulos e contratos

## Dependencias
- Dependencias sempre apontam para dentro do modulo via ports
- Proibido acesso direto a repositories de outro modulo
- Eventos de dominio sao publicados via outbox

## Contratos publicos (ports)
| Modulo | Ports expostos | Exemplos |
| --- | --- | --- |
| expenses | ExpenseCommand, ExpenseQuery | criar despesa, listar por usuario |
| approvals | ApprovalWorkflowPort | criar workflow, aprovar etapa |
| policies | PolicyValidationPort | validar politica |
| budgets | BudgetReservePort | reservar, confirmar, liberar |
| attachments | AttachmentStoragePort | registrar e recuperar metadados |
| notifications | NotificationPort | enviar email/slack |
| audit | AuditAppendPort | registrar evento imutavel |
| shared | N/A | Money, Ids, Time, Result |

## Eventos de dominio (exemplos)
- ExpenseSubmitted
- ExpenseApproved
- BudgetReserved
- PolicyViolationDetected

## Spring Modulith
- Modulos declarados com @ApplicationModule em package-info.java
- APIs publicas marcadas com @NamedInterface("api")
- Validacao automatica em architecture-tests/ModulithArchitectureTest.java
