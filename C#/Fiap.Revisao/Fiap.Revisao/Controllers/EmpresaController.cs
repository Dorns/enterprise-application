using Fiap.Revisao.Models;
using Fiap.Revisao.Units;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Fiap.Revisao.Controllers
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
                TempData["msg"] = "Empresa Cadastrada com Sucesso!";
                return RedirectToAction("Cadastrar");
            }
            else
            {
                return View(empresa);
            }
        }

        protected override void Dispose(bool disposing)
        {
            _unit.Dispose();
            base.Dispose(disposing);
        }
    }
}