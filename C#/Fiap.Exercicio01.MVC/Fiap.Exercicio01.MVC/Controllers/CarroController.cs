using Fiap.Exercicio01.MVC.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Fiap.Exercicio01.MVC.Controllers
{
    public class CarroController : Controller
    {
        //Simular o banco
        private static IList<Carro> _lista = new List<Carro>();

        [HttpGet] //Abre o formulario
        public ActionResult Cadastrar()
        {
            return View();
        }

        [HttpPost]//Processa o formulario
        public ActionResult Cadastrar(Carro carro)
        {
            _lista.Add(carro);
            TempData["msg"] = "Cadastrado!";
            return View();
        }

        //mvcaction4
        public ActionResult Listar()
        {
            //Passa a lista para a tela
            return View(_lista);
        }
    }
}