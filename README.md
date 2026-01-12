## Desafio de Programação Backend Java - Itaú Unibanco💻


O desafio consiste em criar uma API REST simples em Java/Kotlin com Spring Boot para processar transações e calcular estatísticas em tempo real. O repositório pertence ao Feltex e é usado como etapa de seleção para uma vaga no Itaú.

### Objetivo Principal 🎯
Criar uma API com três endpoints que manipule transações sem usar banco de dados ou cache externo (tudo em memória).

### Endpoints Obrigatórios📝

- **POST /transacao**: Recebe uma transação com valor e dataHora (ISO 8601). Valida se a data não é futura e se o valor é não-negativo. Responde com 201 (sucesso), 422 (dados inválidos) ou 400 (requisição malformada).

- **DELETE /transacao**: Apaga todas as transações armazenadas em memória. Responde com 200.

- **GET /estatistica**: Calcula e retorna um JSON com count, sum, avg, min e max apenas das transações dos últimos 60 segundos. Se não houver transações, todos os valores devem ser 0.

Esse é apenas um resumo. Esse é o link que apresenta o desafio: https://github.com/feltex/desafio-itau-backend
