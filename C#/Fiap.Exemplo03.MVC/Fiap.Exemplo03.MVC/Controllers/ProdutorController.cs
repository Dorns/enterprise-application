using Fiap.Exemplo03.MVC.Models;
using Fiap.Exemplo03.MVC.Persistencia;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Fiap.Exemplo03.MVC.Controllers
{
    public class ProdutorController : Controller
    {
        private SacolaoContext _context = new SacolaoContext();
        // GET: Produtor
        [HttpGet]
        public ActionResult Cadastrar()
        {
            return View();
        }

        [HttpPost]
        public ActionResult Cadastrar(Produtor produtor)
        {
            produtor.DataCadastro = DateTime.Now;
            //"Instancia um novo produtor no banco"
            _context.Produtores.Add(produtor);
            //Salva no banco
            _context.SaveChanges();
            TempData["msg"] = "Cadastrado!";
            //Para nao cadastrar novamente no F5
            return RedirectToAction("Cadastrar");
        }
        [HttpGet]
        public ActionResult Listar()
        {
            return View(_context.Produtores.ToList());
        }
    }
}