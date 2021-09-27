
# noticias-api

**Instruções para execução**

    git clone https://github.com/tavogus/noticias-api.git

    cd noticias-api

    mvnw spring-boot:run

**Chamar requisições via postman, insomnia**

**POST localhost:8080/v1/noticias**

    {
        "url": "https://www.infomoney.com.br/onde-investir/captacoes-de-recursos-com-metas-esg-geram-valor-ao-acionista-no-longo-prazo/"
    }

**GET localhost:8080/v1/noticias**

    {
        "id": 1,
        "url": "https://www.infomoney.com.br/onde-investir/captacoes-de-recursos-com-metas-esg-geram-valor-ao-acionista-no-longo-prazo/",
        "titulo": "Captações de recursos com metas ESG geram valor ao acionista no longo prazo",
        "subtitulo": "Suzano, Movida, B3 e Rumo captaram juntas US$ 2 bilhões, mas registraram uma demanda cerca de quatro vezes maior",
        "autor": "Por Estadão Conteúdo",
        "data": "18 set 2021 11h05",
        "conteudo": [
            "Neste mês, ao menos quatro grandes empresas anunciaram operações de captação de recursos no mercado internacional por meio de títulos de dívida (bonds) vinculados a critérios ESG (sigla para boas práticas ambientais, sociais e de governança).",
            "Suzano (SUZB3), Movida (MOVI3), B3 (B3SA3) e Rumo (RAIL3) captaram juntas US$ 2 bilhões, conforme informou a Coluna do Broadcast, mas registraram uma demanda cerca de quatro vezes maior.",
            "As operações preveem uma remuneração adicional caso as metas ESG não sejam atingidas no prazo combinado. A maior parte dos compromissos está relacionada a medidas ambientais, mas já começam a aparecer também propostas na área social, como maior porcentual de mulheres em cargos de liderança.",
            "",
            "Embora incipiente, o movimento reflete o que está por vir. Na opinião do economista-chefe do Modalmais, Álvaro Bandeira, esse é o caminho do futuro para empresas serem bem precificadas no mercado local e internacional.",
            "O próximo passo, segundo ele, devem ser atuações mais decisivas de formadores de opinião e analistas, para disseminar a cultura junto aos investidores. “Em termos gerais, o Brasil está atrasado no desenvolvimento de políticas mais responsáveis sobre meio ambiente, gestão financeira e social, mas o setor privado já está capturando isso”, avalia.",
            "O impacto dessas medidas no preço das ações não tende a ser imediato. Porém, com relação ao potencial de valorização da empresa, essas emissões têm viés positivo, porque representam um custo menor das dívidas no médio e longo prazo em comparação com as emissões de títulos de dívida tradicionais.",
            "Segundo Vitor Suzaki, do Banco Daycoval, é cedo para afirmar que isso pode influenciar a lucratividade das empresas, porque essas emissões ainda não são a maioria do endividamento das companhias. Se isso acontecer, pode implicar despesa financeira menor, o que é sempre bem-vindo, e remuneração maior aos acionistas por consequência.",
            "Pedro Galdi, da Mirae Asset, ressalta que o mercado financeiro global abre janelas, seja para emissões em renda variável ou para renda fixa. E os investidores no exterior, segundo ele, estão receptivos a lançamentos de empresas com rating elevado e principalmente as bem enquadradas no conceito ESG.",
            "“",
            "",
            "",
            ""
        ]
    }
