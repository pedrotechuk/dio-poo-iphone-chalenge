# 📱 DIO desafio iPhone - POO com Java

Este projeto foi desenvolvido como parte do desafio de Programação Orientada a Objetos (POO) da DIO, com base no vídeo de lançamento do iPhone de 2007. Ele modela e implementa as principais funcionalidades do iPhone utilizando interfaces e classes em Java, com apoio de diagramação UML.

---

## 🧠 Objetivo

Modelar e implementar um **componente iPhone** com três funcionalidades principais:
- 🎵 Reprodutor Musical
- 📞 Aparelho Telefônico
- 🌐 Navegador na Internet

---

## 📐 Diagrama UML

O diagrama abaixo foi elaborado utilizando a sintaxe **Mermaid**, representando as interfaces e a classe `iPhone` que implementa todas as funcionalidades:

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
