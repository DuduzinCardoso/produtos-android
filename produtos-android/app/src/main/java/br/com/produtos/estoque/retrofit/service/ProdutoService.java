package br.com.produtos.estoque.retrofit.service;

import java.util.List;

import br.com.produtos.estoque.model.Produto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ProdutoService {

    @GET("teste")
    Call<List<Produto>> buscaTodos();

    @POST("teste")
    Call<Produto> salva(@Body Produto produto);

    @PUT("teste/{id}")
    Call<Produto> edita(@Path("id") long id,
                        @Body Produto produto);

    @DELETE("teste/{id}")
    Call<Void> remove(@Path("id") long id);

}
