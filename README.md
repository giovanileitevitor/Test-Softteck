# Github Explorer

Hi Dev / Sir

O **Github Explorer** é um aplicativo simples para listar os repositórios do GitHub com mais estrelas e com código Kotlin.

## Detalhes sobre o projeto:

- Desenvolvido inteiramente em Kotlin

- Uso de Paging 3 para paginação da lista de repositórios

- Desenvolvido a seguindo Clean Architecture e MVVM

- Utiliza Kotlin Flow para chamada assíncrona

- Testes unitários das camadas de data (PagingSource, Repository), domain (UseCase) e presentation (ViewModel)

## Tela 1 - Lista de Repositorios:

A tela 1 ou tela inicial pode apresentar três estados distintos:

<img width="1053" alt="Captura de Tela 2022-10-06 às 17 23 12" src="https://user-images.githubusercontent.com/11378932/194411231-220c4955-4c68-46e6-8c99-7a5a6693df76.png">

##### Estado de carregamento

Ao entrar na tela o carregamento da lista é iniciado, exibindo um loading para o usuário.

##### Estado de sucesso

Se a chamada for realizada com sucesso, será exibida uma lista com os repositórios do Github.

##### Estado de erro

Se ocorrer uma falha no carregamento da lista, será exibida uma mensagem de erro com um botão para tentar novamente.

Se o device for rotacionado, o aplicativo mantém o estado da tela.


## Tela 2 - Lista de Usuários:

Esta tela só está disponivel na versão paga do projeto.
Para acessá-la, faça um pix no valor de 150 reais para a chave abaixo:
Chave Pix: +55 11 975313142

<img width="305" alt="Captura de Tela 2023-05-20 às 21 56 01" src="https://github.com/giovanileitevitor/Test-Softteck/assets/27828713/c5c426c9-f086-433b-a4be-e6f4d2ce1ba2">



## Testes Unitários via Gradle / Esteira

Para realizar a execução dos testes unitários via comando gradle / esteira, basta digitar no terminal do projeto o comando:
- gradlew test --info

