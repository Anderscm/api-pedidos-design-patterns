# 📦 API de Gestão de Pedidos com Design Patterns (GoF)

Projeto autoral desenvolvido em Java com Spring Boot para consolidação e aplicação prática de Padrões de Projeto (*Design Patterns*), como parte do desafio de projeto da **Digital Innovation One (DIO)**.

---

## 📐 Padrões de Projeto Aplicados

1. **Strategy (`CalculoFreteStrategy`):**
   - Utilizado para permitir a troca dinâmica de algoritmos de cálculo de frete sem alterar o código principal.
   - Implementações disponíveis:
     - `FreteNormalStrategy`: Aplica taxa fixa de R$ 15,00.
     - `FreteExpressStrategy`: Aplica taxa fixa de R$ 35,00.

2. **Facade (`PedidoFacadeService`):**
   - Abstrai a complexidade do sistema em uma interface única de serviço.
   - A camada Service orquestra a seleção da estratégia de frete correta, o cálculo do valor final do pedido e a gravação dos dados no repositório.

3. **Singleton:**
   - Gerenciado nativamente pelo Spring Framework através da injeção de dependências e anotações como `@Service`, `@RestController`, `@Repository` e `@Component`, garantindo instâncias únicas dos componentes durante o ciclo de vida da aplicação.

---

## 🛠️ Tecnologias e Ferramentas

- **Java 21**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (Banco de dados relacional em memória)
- **Maven**

---

## 🚀 Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone [https://github.com/Anderscm/api-pedidos-design-patterns.git](https://github.com/Anderscm/api-pedidos-design-patterns.git)