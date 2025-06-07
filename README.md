# Global Solution - Domain Driven Design Java
## Grupo 3M Tech
- Felipe Nakama | RM 552821
- Lucas Masaki | RM 553084
- Micael Azarias | 552699

## Desafio
As Queimadas podem ser causadas por fatores naturais, como raios, atividades humanas, queimas controladas que saem do controle, fogueiras mal apagadas e até mesmo atos criminosos. Com o aumento das temperaturas globais e a ocorrência de secas prolongadas, a frequência e a intensidade dos incêndios florestais e das queimadas têm crescido, afetando significativamente o meio ambiente e a saúde pública. 
Esses incêndios não apenas destroem a vegetação, afetando a fauna e a flora, mas também emitem grandes quantidades de fumaça e partículas tóxicas na atmosfera. Isso representa uma ameaça à saúde das comunidades próximas e até mesmo de áreas distantes. Isso ocorre porque, dependendo das condições meteorológicas e das correntes de ar, a dispersão desses poluentes pode afetar regiões urbanas e rurais a grandes distâncias, resultando em impactos de saúde em uma área ainda maior.

Em 2024, o Brasil registrou mais de 270.000 focos de incêndio, o que representa um aumento de quase 50% em relação a 2023, contabilizando cerca de 30 milhões de hectares queimados, chegando a quase 80% a mais que o ano anterior(2022). Esses aumentos alarmantes ressaltam a importância de se agir de forma rápida e inteligente no combate desses focos. 
Focando nos problemas dessas queimadas, nós podemos citar três grandes consequências diretas.
- A ambiental, com a destruição de habitat, diminuição de fauna e flora locais.
- A saúde pública com o aumento de casos de asma, bronquite, infartos e outros problemas respiratórios, já que as partículas finas conseguem viajar por quilômetros.
- O econômico, com prejuízos ao agronegócio, turismo ecológico e aos próprios recursos naturais que sustentam a economia de diversas regiões pouco industrializadas.

O nosso projeto não só traz uma solução inovadora para o monitoramento dessas queimadas, mas traz também um cenário de enorme oportunidade de mercado, já que só em 2023, o mercado global de vigilância por drones atingiu cerca de 212 milhões de dólares e está projetado para atingir investimentos de mais de 680 milhões de dólares até 2032.
E no Brasil, as importações de drones cresceram mais de 100% em unidades só entre janeiro e maio de 2024. Ou seja, existe um apetite claro por soluções que unam eficiência, tempo real e custo reduzido no combate às queimadas.

## Solução
A nossa solução para esse problema seria o uso de drones para coleta de dados em tempo real de GPS, temperatura, umidade e densidade seriam transmitidas via protocolos usados no IoT, trazendo segurança e eficiência para que os dados cheguem na central eficientemente.

Na central será realizado a análise preditiva com machine learning, prevendo possíveis focos de incêndio, soando um alerta rapidamente caso o ambiente esteja em condições para potencial queimadas. O sistema possuirá um mapa interativo com os locais pré-configurados de onde o drone faz as coletas dos dados, podemos filtrar os dados de acordo com a análise que queremos realizar no momento. 
Além de termos os dados em tempo real da situação em que se encontra o ambiente, com alertas ativos, temperatura, umidade e os drones online na missão.

O sistema também possuirá uma tela da missão de voo, onde conseguimos traçar o caminho dos drones para piscina ou o lago próximas da região do fogo, de forma que o piloto consiga realizar o seu trabalho de forma mais eficiente.
O mapa também contém dados da situação atual da missão, como coordenadas, altitude de voo do drone, o horário que o drone deve decolar e pousar e os drones que estão ativos na missão. 

## Arquitetura da solução
1- Os drones eles são a nossa fonte primária de dados responsáveis pela captação inicial de informação e imagens aéreas monitoradas.<br>
2- Dados fluem para o broker. Em seguida, temos o serviço de coleta, onde recebe, processa e roteia os dados brutos para os nossos sistemas de armazenamento e análise. Os dados coletados são armazenados no banco de dados. <br>
3- Em sequência, o modelo de predição com machine learning entra em ação.<br>
4- Por fim, temos o serviço de dashboard com uma interface onde visualizamos todos os dados, permitindo o monitoramento em tempo real e análise aprofundada das informações.<br>

## Funcionalidades do sistema em Java
O sistema foi desenvolvido com Java Spring Boot, realizando conexão com o banco de dados Oracle, possibilitando o usuário de armazenar e gerir os dados pelo próprio sistema. 
O banco de dados possui 4 tabelas:
- Drone: Onde ficam armazenados os drones disponíveis para o uso com o nome e modelo.
- Localizacao: Onde ficam armazenados coordenadas de latitude, longitude e altitude que o drone deve realizar a coleta de dados.
- Funcionário: Onde possuem dados dos funcionários do projeto, contendo nome, cpf, função e endereço.
- Coleta: Onde possui os dados de umidade, temperatura, densidade de vegetação e horário em que o drone realizou a coleta, além de gurardar informações como o piloto que fez a coleta, o drone utilizado e a localização em que a coleta foi realizada.

O sistema consegue listar, deletar, editar e incrementar dados em cada uma dessas tabelas, além de soar um aviso de alerta caso a coleta do drone tiver com os dados de temperatura acima de 35 graus Celsius ou caso a umidade esteja abaixo de 20%.
