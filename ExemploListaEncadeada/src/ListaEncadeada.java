/**
 *
 * @author 0031432312005
 */
public class ListaEncadeada {
    IntNoSimples primeiro, ultimo;
    int numero_nos = 0;
    
    ListaEncadeada(){
        primeiro = null;
        ultimo = null;
    }
    void insereNo_inicio(IntNoSimples novoNo){
        novoNo.prox = primeiro;
        if(primeiro == null && ultimo == null){
            ultimo = novoNo;
        }
        primeiro = novoNo;
        numero_nos++;
    }
    void insereNo_fim(IntNoSimples novoNo){
        novoNo.prox = null;
        if(primeiro == null)
            primeiro = novoNo;
        if(ultimo != null)
            ultimo.prox = novoNo;
        ultimo = novoNo;
        numero_nos++;
    }
    void insereNo_posicao(IntNoSimples novoNo, int posicao){
        IntNoSimples temp_no = primeiro;
        int pos_aux;
        
        if(posicao == 0){
            novoNo.prox = primeiro;
            if(primeiro == ultimo){
                ultimo = novoNo;
            }
            primeiro = novoNo;
        }
        else{
            if(posicao <= numero_nos){
                pos_aux = 1;
                while(temp_no != null && posicao > pos_aux){
                    temp_no = temp_no.prox;
                    pos_aux++;
                }
                novoNo.prox = temp_no.prox;
                temp_no.prox = novoNo;
            }
            else{
                if(posicao > numero_nos){
                    ultimo.prox = novoNo;
                    ultimo = novoNo;
                }
            }
        }
    }
}
