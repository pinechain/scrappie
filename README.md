# Scrappie
Have you ever wondered what could be possibly done scraping whatever is left in your fridge by the end of the month? Well, I have, more frequently than I am proud to admit. Motivated by that, I put into motion the Scrappie project, an old idea where you would simply input things that you have in your fridge right now, and you would get a list of recipes that use them. 

> Já se perguntou o que possivelmente poderia ser feito ao vasculhar os restos na sua geladeira no fim do mês? Bom, eu já, e mais frequentemente do que me orgulho de admitir. Motivado por isso, botei em prática o projeto Scrappie, uma ideia antiga onde você simplesmente informaria coisas que você tem na sua geladeira no momento, e você receberia de volta uma lista de receitas que as usam.

![](scrappie-demo.gif)

It is also a sandbox application where I can play around with new Android knowledges and technologies. As it grows, I plan to write several bilingual (English and Portuguese) posts about it, in an effort to strenghten someone else's skills along with mine. These will be posted in this very repository wiki, and linked to my LinkedIn profile (no pun intended).

> Também se trata de uma aplicação sandbox que eu possa brincar e experimentar com novos conhecimentos e tecnologias em Android. Conforme o projeto cresce, planejo escrever uma série de posts bilingues (inglês e português) sobre ele, num esforço para fortalecer as habilidades de mais alguém junto com a minha. Eles serão publicado na wiki desse mesmo repositório, e compartilhados no meu perfil do LinkedIn.

I hope this will be an awesome journey for everyone!

> Espero que isso seja uma excelente jornada para todos e todas!

## How to install
This project is actually a very simple straight-forward Android application, so no big mysteries here. 

> Esse projeto é na verdade uma aplicação bem simples e direta, sem grandes mistérios.

However, before you can use the application, you must get a [Spoonacular](https://spoonacular.com/) API key, or you won't be able to make any searches at all. With the free plan, you are able to call their API 150 times per day, which currently translates in this app to 75 searches - 75 presses on that big green button in the bottom of the first screen, in other words.

> Entretanto, antes que seja possível utilizar a aplicação, deve-se obter uma chave da API do [Spoonacular](https://spoonacular.com/), ou não será possível realizar nenhuma busca. Com o plano gratuito, é possível chamar a API 150 vezes por dia, o que se converte atualmente a 75 buscas nesse app - 75 clicks no grande botão verde na base da primeira tela, em outras palavras.

Once you have the key, all you need to do, assuming you have the Gradle plugin and the Gradle Wrapper installed, is to type in the command line interface of your choice:

> Uma vez em posse da chave, tudo que precisa ser feito, assumindo que o plugin do Gradle e o Wrapper do Gradle estejam instalados, é digitar na interface de linha de comando de sua escolha:

```
$ gradlew installDebug -PapiKey=<your-api-key-here>
```

For instance, if your API key is "aaaaaa8394aaaaa", then you would type:

> Por exemplo, se sua chave de API for "aaaaaa8394aaaaa", então você digitaria:

```
$ gradlew installDebug -PapiKey=aaaaaa8394aaaaa
```
