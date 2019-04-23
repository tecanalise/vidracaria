package br.com.mjailton.vendasjsf.bean;


  
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import br.com.mjailton.vendasjsf.dao.UsuarioDAO;
import br.com.mjailton.vendasjsf.modelo.Usuario;
  
  
@ManagedBean(name = "LoginMB")
@ViewScoped
public class LoginBean {
  
      private UsuarioDAO usuarioDAO = new UsuarioDAO();
      private Usuario usuario = new Usuario();
       
      public String envia() {
             
            usuario = usuarioDAO.getUsuario(usuario.getNomeUsuario(), usuario.getSenha());
            if (usuario == null) {
                  usuario = new Usuario();
                  FacesContext.getCurrentInstance().addMessage(
                             null,
                             new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
                                         "Erro no Login!"));
                  return null;
            } else {
                  return "cliente.xhtml";
            }
             
             
      }
      
      public String logout() {
          HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
          sessao.invalidate();
          return "login.xhtml"; //AQUI EU PASSO O NOME DA MINHA TELA INICIAL.
        }
  
      public Usuario getUsuario() {
            return usuario;
      }
  
      public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
      }
}