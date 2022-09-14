package com.example.listaprodutos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.Adapter.AdapterProduto
import com.example.listaprodutos.model.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_protudos)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this)
        recyclerView_produtos.setHasFixedSize(true) //Metodo p/ dar mais desempenho na lista.

        //  Adapter Configurado
        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this, listaProdutos)
        recyclerView_produtos.adapter = adapterProduto

        val produto1 = Produto(
            foto = R.drawable.carro,
            nome = "Kamaro",
            descricao = "O Camaro é um coupé esportivo de porte médio da Chevrolet. Produzido desde 1966, trata-se de muscle car que seria a resposta da General Motors ao Ford Mustang, de 1964. Sua produção foi interrompida em 2002, mas a General Motors retomou a produção de uma nova versão em 2009",
            preco = "Preco Mercado R$150.000,00"
        )
        val produto2 = Produto(
            foto = R.drawable.agua,
            nome = "Água",
            descricao = "A água é um recurso natural abundante no planeta, essencial para a existência e sobrevivência das diferentes formas de vida. Trata-se de uma substância química formada pela junção de dois átomos de hidrogênio (H) e um átomo de oxigênio (O)",
            preco = "Preco Mercado R$2,00 o litro"
        )
        val produto3 = Produto(
            foto = R.drawable.laranja,
            nome = "Laranja",
            descricao = "A laranja é o fruto da laranjeira, árvore da família Rutaceae. Possui porte médio que pode atingir até 8 metros de altura, tronco de cor castanho e copa de formato arredondado. A fruta é de origem asiática, foi levada pelos árabes para a península Ibérica e de lá se propagou pelo mundo.",
            preco = "Preco Mercado R$ 10,00 o Kilo"
        )
        val produto4 = Produto(
            foto = R.drawable.locomotiva,
            nome = "Locomotiva",
            descricao = "Uma locomotiva é um veículo ferroviário que fornece a energia necessária para a colocação de um comboio ou trem em movimento; as locomotivas não têm capacidade de transporte própria, quer de passageiros, quer de carga.",
            preco = "Preco Mercado R$850.000,00"
        )
        val produto5 = Produto(
            foto = R.drawable.planeta,
            nome = "Planeta",
            descricao = "Um planeta é um corpo celestial que (a) está em órbita em torno do Sol, (b) possui massa suficiente para que sua própria gravidade supere as forças de corpo rígido, de modo que ele adquira uma forma de equilíbrio hidrostático (próxima à esférica) e (c) tenha dominância em sua órbita",
            preco = "Preco Mercado R$~~~~~~~~~~"
        )
        val produto6 = Produto(
            foto = R.drawable.planeta,
            nome = "Planeta",
            descricao = "Um planeta é um corpo celestial que (a) está em órbita em torno do Sol, (b) possui massa suficiente para que sua própria gravidade supere as forças de corpo rígido, de modo que ele adquira uma forma de equilíbrio hidrostático (próxima à esférica) e (c) tenha dominância em sua órbita",
            preco = "Preco Mercado R$~~~~~~~~~~"
        )
        val produto7 = Produto(
            foto = R.drawable.planeta,
            nome = "Planeta",
            descricao = "Um planeta é um corpo celestial que (a) está em órbita em torno do Sol, (b) possui massa suficiente para que sua própria gravidade supere as forças de corpo rígido, de modo que ele adquira uma forma de equilíbrio hidrostático (próxima à esférica) e (c) tenha dominância em sua órbita",
            preco = "Preco Mercado R$~~~~~~~~~~"
        )
        val produto8 = Produto(
            foto = R.drawable.planeta,
            nome = "Planeta",
            descricao = "Um planeta é um corpo celestial que (a) está em órbita em torno do Sol, (b) possui massa suficiente para que sua própria gravidade supere as forças de corpo rígido, de modo que ele adquira uma forma de equilíbrio hidrostático (próxima à esférica) e (c) tenha dominância em sua órbita",
            preco = "Preco Mercado R$~~~~~~~~~~"
        )

        listaProdutos.add(produto1)
        listaProdutos.add(produto2)
        listaProdutos.add(produto3)
        listaProdutos.add(produto4)
        listaProdutos.add(produto5)
        listaProdutos.add(produto6)
        listaProdutos.add(produto7)
        listaProdutos.add(produto8)


    }
}