package com.example.listaprodutos.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.example.listaprodutos.model.Produto

class AdapterProduto(
    private val context: Context,
    private val produtos: MutableList<Produto>
) : RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {

    //Cria
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.hardware_item1, parent, false)
        val holder = ProdutoViewHolder(itemLista)
        return holder
    }

    //Exibe
    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco
    }

    override fun getItemCount(): Int = produtos.size


    //Esta classe vai "trazer" atraves de variaveis os itens do XML
    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.carro)
        val nome = itemView.findViewById<TextView>(R.id.tituloCarro)
        val descricao = itemView.findViewById<TextView>(R.id.descricaoCarro)
        val preco = itemView.findViewById<TextView>(R.id.precoCarro)


    }
}