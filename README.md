# 🧩 Padrão Visitor – Processamento de Pessoas

Este projeto demonstra a aplicação do **padrão comportamental Visitor** para processamento de diversos tipos de pessoas (Aluno, Professor, Funcionário).  
O objetivo é permitir a **criação de novas operações** sobre essa hierarquia **sem modificar** as classes originais, garantindo extensibilidade e baixo acoplamento.

---

## 📘 O que é o Padrão Visitor?

O **Visitor** é um padrão comportamental que separa algoritmos da estrutura de objetos sobre os quais eles operam.  
Em vez de colocar várias operações dentro das classes de domínio, criamos objetos visitantes que percorrem essas classes e executam ações específicas.

> 🔍 Ideal quando você quer aplicar várias operações diferentes em uma mesma hierarquia de classes — como exportar, validar, converter, calcular, etc. — sem alterar o código existente.

---

## 🧱 Estrutura

### 🔸 **Element (Elemento)**  
Interface/classe que define o método:  
`accept(Visitor visitor)`

➡️ No projeto: `Pessoa` (ou interface equivalente)

---

### 🔸 **Concrete Elements (Elementos Concretos)**  
Implementam o método accept chamando visitor.visit(this):

- `Aluno`
- `Professor`
- `Funcionario`

---

### 🔸 **Visitor (Visitante)**  
Interface que define como visitar cada tipo de elemento:

```java
void visit(Aluno aluno);
void visit(Professor professor);
void visit(Funcionario funcionario);
```

### 🔸 **Concrete Visitors (Visitantes Concretos)**

Implementam diferentes operações:

VisitorXml → exporta para XML

VisitorJson → exporta para JSON

PessoaVisitor → formatação legível

Outros visitantes podem ser adicionados: CSV, HTML, relatório financeiro, validação etc.
