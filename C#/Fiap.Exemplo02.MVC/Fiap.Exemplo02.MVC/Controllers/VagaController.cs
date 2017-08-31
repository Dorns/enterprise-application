using Fiap.Exemplo02.MVC.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Fiap.Exemplo02.MVC.Controllers
{
    public class VagaController : Controller
    {
        //Simular o banco de dados....
        private static List<Vaga> _banco = new List<Vaga>();
       
        [HttpGet]
        public ActionResult Cadastrar()
        {
            PopulaComboNiveis();

            return View();
        }

        private void PopulaComboNiveis()
        {
            //Valores para preencher o select
            List<string> niveis = new List<string>();
            niveis.Add("Junior");
            niveis.Add("Pleno");
            niveis.Add("Sênior");
            ViewBag.opcoes = new SelectList(niveis);
        }

        [HttpPost]
        public ActionResult Cadastrar(Vaga vaga)
        {
            //cadastra no banco de dados
            _banco.Add(vaga);
            //Mensagem de sucesso para a view
            TempData["msg"] = "Vaga registrada!";
            PopulaComboNiveis();
            return View();
        }

        [HttpGet]
        public ActionResult Listar()
        {
            //Retorna a lista de vagas para a view
            return View(_banco);
        }
    }
}