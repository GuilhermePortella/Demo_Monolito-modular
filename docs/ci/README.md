# CI/CD - Documentacao de pipeline (exemplo)

Este diretorio contem arquivos **de referencia**, nao usados no build padrao.

## Conteudo
- `docs/ci/pom-ci.xml`: POM alternativo com plugins e propriedades de CI/CD.
- `docs/ci/ci.yml`: Workflow exemplo (GitHub Actions) com build, testes, sonar e release.

## Como usar
- Para executar localmente com o POM de CI:
  `mvn -f docs/ci/pom-ci.xml test`

- Para ativar o workflow no GitHub:
  1) Copie `docs/ci/ci.yml` para `.github/workflows/ci.yml`.
  2) Ajuste secrets (`SONAR_TOKEN`, `MAVEN_USERNAME`, `MAVEN_PASSWORD`, `AWS_*`).
  3) Ajuste `sonar.host.url` e o destino de publicacao.

## Observacoes
- O runtime em producao continua sendo o modulo `app`.
- A pipeline publicada aqui e apenas um blueprint.
