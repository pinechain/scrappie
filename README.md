# Scrappie
Have you ever wondered what could be possibly done scraping whatever is left in your fridge by the end of the month? Well, I have, more frequently than I am proud to admit. Motivated by that, I put into motion the Scrappie project, an old idea where you would simply input things that you have in your fridge right now, and you would get a list of recipes that use them. 

> Já se perguntou o que possivelmente poderia ser feito ao vasculhar os restos na sua geladeira no fim do mês? Bom, eu já, e mais frequentemente do que me orgulho de admitir. Motivado por isso, botei em prática o projeto Scrappie, uma ideia antiga onde você simplesmente informaria coisas que você tem na sua geladeira no momento, e você receberia de volta uma lista de receitas que as usam.

![](scrappie-demo.gif)

It is also a sandbox application where I can play around with new Android knowledges and technologies. As it grows, I plan to write several bilingual (English and Portuguese) posts about it, in an effort to strenghten someone else's skills along with mine. These will be posted in this very repository wiki, and linked to my LinkedIn profile (no pun intended).

> Também se trata de uma aplicação sandbox que eu possa brincar e experimentar com novos conhecimentos e tecnologias em Android. Conforme o projeto cresce, planejo escrever uma série de posts bilingues (inglês e português) sobre ele, num esforço para fortalecer as habilidades de mais alguém junto com a minha. Eles serão publicado na wiki desse mesmo repositório, e compartilhados no meu perfil do LinkedIn.

I hope this will be an awesome journey for everyone!

> Espero que isso seja uma excelente jornada para todos e todas!

## Guidelines | Princípios
This projects abides by the following guidelines:

> Esse projeto age de acordo com os seguintes princípios: 

### Inclusion | Inclusão
I know it's a cliché phrase, but not less true: knowledge is the one of few goods that, when split, are actually multiplied. So the number 1 priority of this project is to **make all knowledge behind it the most available I can**. This is manifested through, but not limited to, **writing bilingual posts**, and **trying to achieve a more natural language in my writing**.

> Sei que é uma frase cliché, mas não menos verdadeira: conhecimento é um dos poucos bens que, quando divididos, são na verdade multiplicados. Então, a prioridade número desse projeto é **fazer todo o conhecimento por trás dele o mais disponível que eu puder**. Isso é manifestado através de, mas não limitado a, **escrever posts bilingues**, e **tentar sempre alcançar uma linguagem mais natural na minha escrita**.

### User needs first | Necessidades do usuário primeiro
This app was born from a need I felt in my daily life. It makes no sense at all to deviate from that and neglect actual user needs to prioritize new features just because "they're cool". **User feedback should always take priority over the developer ideas**. Hence, **this project will always have its issues open**. That way, the project can always be alive with user feedback, bug reports, and feature ideas. **This app is meant to be built with the community's help**!

> Esse app nasceu de uma necessidade que eu tive no meu cotidiano. Não faz nenhum sentido desviar disso e negligenciar necessidades reais de usuário para priorizar novos recursos apenas porque "seria legal ter eles". **Retorno do usuário deve sempre receber mais prioridade que as ideias do desenvolvimento**. Com base nisso, **esse projeto sempre terá suas tarefas abertas**. Dessa forma, o projeto estará sempre vivo com retornos e opiniões de usuários, relatórios de bugs, e ideias de novos recursos. **Esse aplicativo deve ser construído com a ajuda da comunidade**! 

### Quality before deploy | Qualidade antes da entrega
Since this is an independent project, it doesn't suffer from the insane pace imposed by the industry, thus it is not bound by any "time to market". Without that kind of pressure, **the development of new features and maintenance of old ones may take as long as it needs to achieve the desired quality threshold before the app is published**. Actually, in a non-commercial context such as this project's, **time and deadlines should never take priority over quality when determining the moment a product should be released**. With that said, this guideline dictates that **new versions do not have a pre-determined deadline to be available, but they will only reach the community when a certain level of quality is reached**. In other words, it will be ready when it is ready.

> Já que esse projeto é independente, ele não sofre do ritmo insano imposto pela indústria, e por isso não é limitado por nenhum "tempo para estar no mercado". Sem esse tipo de pressão, **o desenvolvimento de novos recursos e a manutenção de recursos já existentes pode levar tanto tempo quanto seja necessário para alcançar o nível de qualidade desejado antes do aplicativo ser publicado**. Na verdade, em um contexto não comercial como o desse projeto, **tempo e prazos nunca deveriam levar prioridade mais alta do que qualidade na hora de determinar quando um produto deve ser disponibilizado**. Dito isso, esse princípio dita que **novas versões não possuem um prazo pré-determinado para serem disponibilizadas, mas elas só irão alcançar a comunidade quando um certo nível de qualidade foi alcançado**. Em outras palavras, estará pronto quando estiver pronto.

### Free access | Livre acesso
While describing the project, I defined it as a "sandbox application". It would be unfair to create a new toy, play with it in front of everyone, talk about it to everyone, but not let anyone else play with it. Thus, **this project is open to anyone that wishes to see how it works from the inside, as well as trying cool new things**. For instance, when discussing this guideline with a friend, I even suggested he could use this very project to put into practice his studies at tests automation. So, go nuts!

> Quando descrevi esse projeto, eu o defini como uma "aplicação sandbox". Seria injusto criar um brinquedo novo, brincar com ele na frente de todo mundo, falar dele pra todo mundo, mas não deixar ninguém mais brincar com ele. Portanto, **esse projeto é aberto para qualquer um que queira ver como ele funciona por dentro, além de usá-lo para experimentar com novas coisas legais**. Por exemplo, enquanto discutia sobre esse princípio com um amigo, sugeri que ele poderia usar esse mesmo projeto para colocar em prática seus estudos em automação de testes. Então, viaja aí!

As a direct consequence of this guideline, **this app and its project should not be monetized or commercialized in any way**.

> Como uma consequência direta desse princípio, **esse aplicativo e seu projeto não devem ser monetizados ou comercializados de forma alguma**.

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
