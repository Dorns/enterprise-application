using ProjetoFinalMVC.Models;
using ProjetoFinalMVC.Units;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace ProjetoFinalMVC.Controllers
{
    public class EmpresaController : Controller
    {
        private UnitOfWork _unit = new UnitOfWork();

        //Cadastrar
        [HttpGet]
        public ActionResult Cadastrar()
        {
            return View();
        }

        [HttpPost]
        public ActionResult Cadastrar(Empresa empresa)
        {
            if (ModelState.IsValid)
            {
                _unit.EmpresaRepository.Cadastrar(empresa);
                _unit.Salvar();
                TempData["msg"] = "Cadastrado!";
                return RedirectToAction("Cadastrar");
            }
            else
            {
                return View(empresa);
            }
        }

        //Listar
        [HttpGet]
        public ActionResult Listar()
        {
            return View();
        }

        protected override void Dispose(bool disposing)
        {
            _unit.Dispose();
            base.Dispose(disposing);
        }
    }
}