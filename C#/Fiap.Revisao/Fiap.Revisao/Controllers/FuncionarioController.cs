﻿using Fiap.Revisao.Models;
using Fiap.Revisao.Units;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Fiap.Revisao.Controllers
{
    public class FuncionarioController : Controller
    {
        private UnitOfWork _unit = new UnitOfWork();

        //Cadastrar
        [HttpGet]
        public ActionResult Cadastrar()
        {
            var lista = _unit.EmpresaRepository.Listar();
            ViewBag.empresas = new SelectList(lista, "EmpresaId", "RazaoSocial");
            return View();
        }

        [HttpPost]
        public ActionResult Cadastrar(Funcionario funcionario)
        {
            if (ModelState.IsValid)
            {
                _unit.FuncionarioRepository.Cadastrar(funcionario);
                _unit.Salvar();
                TempData["msg"] = "Empresa Cadastrada com Sucesso!";
                return RedirectToAction("Cadastrar");
            }
            else
            {
                var lista = _unit.EmpresaRepository.Listar();
                ViewBag.empresas = new SelectList(lista, "EmpresaId", "RazaoSocial");
                return View(funcionario);
            }
        }

        //Listar
        [HttpGet]
        public ActionResult Listar()
        {
           return View(_unit.FuncionarioRepository.Listar());
        }

        protected override void Dispose(bool disposing)
        {
            _unit.Dispose();
            base.Dispose(disposing);
        }
    }
}