using Fiap.Exercicio01.MVC.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Fiap.Exercicio01.MVC.Controllers
{
    public class UsuarioController : Controller
    {
        // GET: Usuario
        [HttpGet]
        public ActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public ActionResult Gravar(Usuario usuario)
        {
            var msgRetorno = "";

            try
            {
                msgRetorno = "Nome: " + usuario.Nome + "\nIdade: " + usuario.Idade + "\nEmail: " + usuario.Email;

            }
            catch (Exception ex)
            {
                msgRetorno = "Erro: " + ex.Message;
            }

            TempData["mensagem"] = msgRetorno;

            return View(usuario);
        }
    }
}