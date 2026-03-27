# 🛒 Carrinho de compras - Java

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)

Este é um sistema de **Carrinho de Compras** robusto, desenvolvido em Java, que simula a experiência completa de um cliente em uma loja virtual via terminal. O foco do projeto foi aplicar padrões de código limpo e os pilares da Orientação a Objetos.

---

## 🚀 Funcionalidades

O sistema oferece uma interface interativa com as seguintes opções:

* **Exibição de Vitrine:** Lista de produtos com ID, nome e preço formatado.
* **Adição ao Carrinho:** Sistema de busca por ID na vitrine para inclusão de itens.
* **Remoção de Itens:** Validação de ID para exclusão de produtos do carrinho.
* **Visualização Detalhada:** Exibição de todos os itens escolhidos com o cálculo do **Total** atualizado em tempo real.
* **Finalização de Compra:** Processo de checkout com verificação de segurança (carrinho vazio) e encerramento do programa.

---

## 🛠️ Conceitos Técnicos Aplicados

* **Encapsulamento:** Uso de atributos `private` e métodos `public` para proteção de dados.
* **Collections (ArrayList):** Gerenciamento dinâmico de listas de objetos.
* **Cláusulas de Guarda (Guard Clauses):** Uso de `return` e `break` antecipados para evitar códigos complexos e aninhados.
* **Text Blocks (`"""`):** Implementação de menus e saídas de texto legíveis e organizadas (Recurso do Java Moderno).
* **Separação de Responsabilidades:** Divisão clara entre Modelo (`Produto`), Serviço (`Carrinho`) e Interface (`Main`).

---

## 📂 Estrutura de Arquivos

| Arquivo | Descrição |
| :--- | :--- |
| `Produto.java` | Classe que define o molde do produto (Atributos e toString). |
| `Carrinho.java` | Gerencia a lógica de adicionar, remover e calcular valores. |
| `Main.java` | Ponto de entrada do sistema com o menu interativo. |

---

## 📝 Exemplo de Uso

```text
 <<< VITRINE DE PRODUTOS >>> 
ID: 1 | Produto: Notebook Dell | Preço: R$ 3500.0
ID: 2 | Produto: Mouse sem fio | Preço: R$ 120.0

Selecione a opção:
1 | Adicionar produto no carrinho 
2 | Remover produto do carrinho
3 | Visualizar carrinho
...
