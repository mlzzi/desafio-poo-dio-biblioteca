# 📚 Sistema de Biblioteca - Desafio POO DIO

Esta é um desafio proposto pelo Bootcamp Claro da DIO para exercitar as características da programação orientada ao objeto.
Esse projeto visa simular de forma simples classes de bibliotecas tanto virtaul como fisica bem como livros digitais ou fisicos. 📖

## Funcionalidades 🚀

- **Emprestar Livros**: Permite que usuários emprestem livros físicos (verificando volumes disponíveis) e baixem livros digitais. 📚💾
- **Devolver Livros**: Permite que usuários devolvam livros físicos, atualizando o número de volumes disponíveis. 🔄
- **Gerenciamento de Livros**: Adiciona e gerencia livros físicos e digitais na biblioteca. 🗂️

## Estrutura do Projeto 📂

### Classes

- **`Livro`**: Classe base para representar um livro com atributos comuns como título, autor e ano de publicação. 📖
- **`LivroFisico`**: Extende `Livro` e adiciona funcionalidade para gerenciar volumes físicos e emprestá-los. 📚
- **`LivroVirtual`**: Extende `Livro` e representa livros digitais, sem gerenciamento de volumes. 💻
- **`BibliotecaFisica`**: Gerencia uma coleção de livros e fornece métodos para acessar e manipular a lista de livros. 🏛️
- **`BibliotecaVirtual`**: Gerencia uma coleção de livros digitais e fornece métodos para acessar e manipular a lista de livros digitais. 🏛️
- **`Usuario`**: Representa um usuário que pode emprestar e devolver livros. Gerencia a lista de livros emprestados. 👤

