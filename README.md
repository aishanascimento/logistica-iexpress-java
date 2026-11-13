# 🚚 Sistema de Logística e Fretes - iExpress (Java)

## 📌 Visão Geral
Aplicação desenvolvida em Java para automação e controle de cálculo de fretes em lote da empresa de logística **iExpress**. O sistema foi estruturado aplicando **modularização por funções (métodos)**, tratamento de códigos de erro para validação de dados e processamento contínuo de entregas.

## 🚀 Funcionalidades e Regras de Negócio

- **Processamento em Lote:** Execução contínua de cálculo de fretes através de laço de repetição (`while`), encerrada ao digitar `0` na distância.
- **Isolamento em Função (`calcularFrete`):** Toda a regra de cálculo, descontos e restrições foi isolada em um método dedicado que retorna códigos de controle:
  - Retorna **`-2`**: Dados inválidos informados.
  - Retorna **`-1`**: Incompatibilidade (pacotes acima de 30kg não podem ser urgentes).
- **Regras de Cobrança e Descontos:**
  - **Cálculo Base:** R$ 2,00 por km e R$ 1,50 por kg.
  - **Cliente Premium:** 10% de desconto automático.
  - **Taxa de Urgência:** Acréscimo de R$ 15,00.
- **Resumo Diário:** Exibição do faturamento total acumulado em fretes válidos e contagem de entregas urgentes.

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java
- **Conceitos Aplicados:** Modularização (Funções com Retorno e Parâmetros), Estruturas de Repetição e Decisão, Tratamento de Erros e Acumuladores.
