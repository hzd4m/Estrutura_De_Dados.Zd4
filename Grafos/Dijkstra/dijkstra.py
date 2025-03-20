// Construíremos o algoritmo utilizando tabela HASH
//TH GRAFO + TH CUSTOS + TH PAIS 

infinito = float("inf");

grafo = {}
grafo["A"]={}
grafo["A"]["B"]= 5
grafo["A"]["C"]= 0
grafo["B"]={}
grafo["B"]["D"]= 15
grafo["B"]["E"]= 10
grafo["C"]={}
grafo["C"]["D"]= 20
grafo["C"]["E"]= 35
grafo["D"]={}
grafo["D"]["F"]= 30
grafo["E"]={}
grafo["E"]["F"]= 25
grafo["F"]= {}

//Sempre sinalizar os custos conhecidos 
custos = {}
custos["A"] = 0
custos["B"] = 5
custos["C"] = 0
custos["D"] = infinito
custos["E"] = infinito
custos["F"] = infinito 

pais = {} 
pais["A"] = None
pais["B"] = "A"
pais["C"] = "A"
pais["D"] = None
pais["E"] = None
pais["F"] = None 


processados = [] 

def no_mais_barato(custos):
    custo_mais_barato = infinito 
    no_mais_barato = None 
    for no in custos:
        custos = custos[no]
        if custos < custo_mais_barato and no not in processados:
            custo_mais_barato = custo 
            no_mais_barato = no 
    return no_mais_barato 

def imprimir_caminho(pais , destino): 
    caminho = []
    atual = destino 

    while atual is not None:
        caminho.append(atual)
        atual= pais.get(atual)
    if caminho[-1] == "A":
        caminho.reverse()
        return " -> ".join(caminho)
    else:
        return f"Nenhum caminho encontrado até o destino {destino}"