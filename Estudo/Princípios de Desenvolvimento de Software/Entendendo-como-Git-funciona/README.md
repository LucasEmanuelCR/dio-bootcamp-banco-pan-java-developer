# 🧠 Aula: Entendendo como o Git Funciona por Baixo dos Panos

## 🔑 Tópicos Fundamentais

- Git é um sistema de controle de versão distribuído e seguro.
- Sua segurança se baseia no uso de hashes criptográficos (SHA-1) para garantir a integridade dos dados.
- Cada versão é identificada por um hash único, o que evita alterações não rastreadas.

---
## 🔐 SHA-1 (Secure Hash Algorithm)

**Definição**: Algoritmo de hash criptográfico desenvolvido pela NSA.  
**Funcionamento**: Gera um identificador único de 40 caracteres com base no conteúdo de um arquivo.

**Finalidade no Git**:
- Garante a integridade dos dados.
- Serve como um identificador compacto para objetos.

**Comando (fora do Git)**:
`bash
openssl sha1 [arquivo]

---
## 🧱 Objetos Internos do Git

O Git armazena seus dados em **três tipos principais de objetos**:

### 1. Blobs

- Representam o conteúdo bruto de arquivos.
- **Estrutura**: `blob [tamanho]\0[conteúdo]`

**Criar SHA-1 para um conteúdo**:
``bash
echo 'conteudo' | git hash-object --stdin

### 2. Trees

- Representam diretórios e armazenam referências a **blobs** e outras **trees**.
- **Estrutura**: `[modo] [nome_do_arquivo]\0[SHA-1]`
- **Função**: Mapeia a estrutura dos arquivos do repositório.

### 3. Commits

- Representam versões do projeto.
- Armazenam:
  - Referência à **tree** correspondente.
  - Referência(s) ao(s) **commit(s) pai(s)**.
  - Informações do **autor**, **data** e **mensagem do commit**.

---
## 🔐 Chave SSH e Token de Acesso

### 🔒 Chave SSH

- Método seguro e criptografado para autenticar a conexão entre sua máquina e o GitHub (ou outro servidor Git).
- Funciona como uma **assinatura digital** da sua máquina.

#### Tipos de chave

- **Chave pública**: Deve ser compartilhada com o GitHub.
- **Chave privada**: Deve ser mantida segura em sua máquina.

#### Comandos úteis

**Gerar uma nova chave**:
``bash
ssh-keygen -t ed25519 -C "seu-email@example.com"
Iniciar o agente SSH: eval $(ssh-agent -s)

---
## 🚀 Primeiros Comandos Git

### `git init`

- Cria um repositório Git no diretório atual.
- Inicializa um ambiente de controle de versão.

### `git add`

- Adiciona arquivos à **staging area** (área de preparação), preparando-os para o commit.

#### Usos comuns:

- Mover um arquivo **Untracked** (não rastreado) para **Staged** (pronto para commit).
- Mover um arquivo **Modified** (modificado) para **Staged**.

> **Importante**:  
> Arquivos no estado **Unmodified** são aqueles que **não foram alterados** desde o último commit.  
> Após o commit, os arquivos voltam automaticamente para o estado de **Unmodified**.

#### `git commit`

- Cria um **commit**, ou seja, uma **captura do estado atual** dos arquivos presentes na **staging area**.
- Após o commit, esses arquivos passam para o estado de **Unmodified**.

---
## 📂 Estados dos Arquivos no Git

Os arquivos em um repositório Git podem estar em dois grandes grupos: **Untracked** ou **Tracked**.

### 🔸 Untracked

- Arquivos que o Git ainda **não controla**.
- Eles não fazem parte do histórico de versões até serem adicionados com `git add`.

### 🔸 Tracked

- Arquivos que o Git está **monitorando**.
- Dentro desse grupo, eles podem estar em três estados:

#### 🔹 Unmodified

- Arquivos **sem alterações** desde o último commit.

#### 🔹 Modified

- Arquivos **alterados**, mas **ainda não adicionados** à staging area.

#### 🔹 Staged

- Arquivos que foram modificados e **preparados para serem commitados**.
- Estão prontos para o próximo `git commit`.



